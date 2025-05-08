package org.codenova.groupwareback.controller;

import lombok.RequiredArgsConstructor;
import org.codenova.groupwareback.entity.*;
import org.codenova.groupwareback.repository.*;
import org.codenova.groupwareback.request.AddChat;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {
    private final ChatRepository chatRepository;
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @PostMapping("/{departmentId}")
    public ResponseEntity<?> postChatHandle(@RequestAttribute String subject,
                                            @RequestBody AddChat addChat,
                                            @PathVariable Integer departmentId) {
        Employee subjectEmployee = employeeRepository.findById(subject).orElseThrow();
        Department department =
                departmentRepository.findById(departmentId).orElseThrow();

        Chat chat = Chat.builder().talker(subjectEmployee)
                .message(addChat.getMessage()).department(department).build();

        chatRepository.save(chat);

        return ResponseEntity.status(201).body(chat);
    }
}
