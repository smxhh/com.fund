package dao;

import domain.User;

/**
 * Created by wangxingjie on 2016/2/4.
 */
public interface UserMapper {
    int insertUser(User user);
    int updatePwd(User user);
    int updateMail(User user);
    User selectUser(Long id);

}
