package com.example.supportcall.service;

import com.example.supportcall.mapper.SupportRequestMapper;
import com.example.supportcall.model.SupportRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service public class SupportRequestService {
  private final SupportRequestMapper mapper;
  public SupportRequestService(SupportRequestMapper mapper){this.mapper=mapper;}
  public void create(String room, String content){ SupportRequest r=new SupportRequest(); r.setRoomNumber(room); r.setRequestContent(content); mapper.insert(r); }
  public List<SupportRequest> active(){return mapper.findAll();}
  public List<SupportRequest> history(){return mapper.findHistory();}
  public SupportRequest latest(String room){return room==null||room.isBlank()?null:mapper.findLatestByRoom(room.trim());}
  public void confirm(Long id){mapper.confirm(id);} public void complete(Long id){mapper.complete(id);}
}
