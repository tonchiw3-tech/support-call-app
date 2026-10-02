package com.example.supportcall.model;

import java.time.LocalDateTime;

public class SupportRequest {
  private Long id; private String roomNumber; private String requestContent; private String status;
  private LocalDateTime requestedAt, confirmedAt, completedAt, createdAt, updatedAt;
  public Long getId(){return id;} public void setId(Long v){id=v;}
  public String getRoomNumber(){return roomNumber;} public void setRoomNumber(String v){roomNumber=v;}
  public String getRequestContent(){return requestContent;} public void setRequestContent(String v){requestContent=v;}
  public String getStatus(){return status;} public void setStatus(String v){status=v;}
  public LocalDateTime getRequestedAt(){return requestedAt;} public void setRequestedAt(LocalDateTime v){requestedAt=v;}
  public LocalDateTime getConfirmedAt(){return confirmedAt;} public void setConfirmedAt(LocalDateTime v){confirmedAt=v;}
  public LocalDateTime getCompletedAt(){return completedAt;} public void setCompletedAt(LocalDateTime v){completedAt=v;}
  public LocalDateTime getCreatedAt(){return createdAt;} public void setCreatedAt(LocalDateTime v){createdAt=v;}
  public LocalDateTime getUpdatedAt(){return updatedAt;} public void setUpdatedAt(LocalDateTime v){updatedAt=v;}
}
