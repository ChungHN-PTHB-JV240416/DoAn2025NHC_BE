package ra.doantotnghiep2025.service;


public interface TokenService {
        void invalidateToken(String token);
        boolean isTokenInvalidated(String token);
}