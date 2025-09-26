package ra.doantotnghiep2025nhc.service;

import ra.doantotnghiep2025nhc.exception.CustomerException;
import ra.doantotnghiep2025nhc.model.dto.WishListRequestDTO;
import ra.doantotnghiep2025nhc.model.dto.WishListResponseDTO;

import java.util.List;

public interface WishListService {
    void addToWishList(Long userId, WishListRequestDTO request) throws CustomerException;
    List<WishListResponseDTO> getWishList(Long userId) throws CustomerException;
    void removeFromWishList(Long wishListId) throws CustomerException;

}
