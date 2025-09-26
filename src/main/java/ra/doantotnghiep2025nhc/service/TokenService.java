package ra.doantotnghiep2025nhc.service;


public interface TokenService {
        void invalidateToken(String token);
        boolean isTokenInvalidated(String token);
}