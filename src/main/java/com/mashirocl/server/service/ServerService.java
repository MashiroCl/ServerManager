package com.mashirocl.server.service;

import com.mashirocl.server.model.Server;

import java.io.IOException;
import java.util.Collection;

/**
 * @author mashirocl@gmail.com
 * @since 2021/11/10 16:21
 *
 */
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
