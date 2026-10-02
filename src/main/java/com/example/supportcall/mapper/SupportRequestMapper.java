package com.example.supportcall.mapper;

import com.example.supportcall.model.SupportRequest;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper public interface SupportRequestMapper {
  void insert(SupportRequest request);
  List<SupportRequest> findAll();
  List<SupportRequest> findHistory();
  SupportRequest findLatestByRoom(String roomNumber);
  int confirm(Long id);
  int complete(Long id);
}
