CREATE TABLE IF NOT EXISTS requests (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  room_number VARCHAR(20) NOT NULL,
  request_content VARCHAR(255) NOT NULL,
  status VARCHAR(20) NOT NULL DEFAULT 'pending',
  requested_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  confirmed_at DATETIME NULL,
  completed_at DATETIME NULL,
  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  INDEX idx_requests_room_requested (room_number, requested_at),
  INDEX idx_requests_status_requested (status, requested_at)
);
