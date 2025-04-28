package org.codenova.groupwareback.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.codenova.groupwareback.entity.Department;
import org.codenova.groupwareback.repository.DepartmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentRepository departmentRepository;

    @GetMapping
    public ResponseEntity<List<Department>> getDepartmentHandle() {
        List<Department> list = departmentRepository.findAll();

        return ResponseEntity.status(200).body(list);   // 200 코드 는 OK 요청이 성공했음을 나타내는 성공 응답 상태 코드
    }


}
