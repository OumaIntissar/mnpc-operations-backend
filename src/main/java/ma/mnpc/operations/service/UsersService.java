package ma.mnpc.operations.service;

import ma.mnpc.operations.entity.Contestant;

public interface UsersService {
    public Contestant login();
    public String logout();

}
