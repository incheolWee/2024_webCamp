package com.example.myapp.repository;

import com.example.myapp.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    @Query("select u from UserInfo u where u.userName = :username and u.userPw= :password")
    Optional<UserInfo> findUserInfoByUserNameAndUserPw(String username, String password);

    @Query("select u from UserInfo u join fetch u.userName where u.userId = :userId")
    Optional<UserInfo> findByIdWIthCollege(Long userId);
//   이거 고쳐야함 잘모름

    Optional<UserInfo> findByUserName(String username);
}
