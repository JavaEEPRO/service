package si.inspired.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}