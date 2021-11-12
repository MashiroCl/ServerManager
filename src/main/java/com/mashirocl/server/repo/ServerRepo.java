package com.mashirocl.server.repo;

import com.mashirocl.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mashirocl@gmail.com
 * @since 2021/11/10 15:57
 */
@Repository
public interface ServerRepo extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);
}
