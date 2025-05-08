package org.codenova.groupwareback.repository;

import org.codenova.groupwareback.entity.Chat;
import org.codenova.groupwareback.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

    public List<Chat> findAllByDepartmentOrderById(Department department);
}
