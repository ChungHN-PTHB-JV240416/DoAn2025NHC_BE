package ra.doantotnghiep2025nhc.service;

import ra.doantotnghiep2025nhc.model.dto.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> getAllActiveCategories();
}
