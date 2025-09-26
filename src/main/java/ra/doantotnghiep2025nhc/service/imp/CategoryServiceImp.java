package ra.doantotnghiep2025nhc.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.doantotnghiep2025nhc.model.dto.CategoryResponseDTO;
import ra.doantotnghiep2025nhc.model.entity.Category;
import ra.doantotnghiep2025nhc.repository.CategoryRepository;
import ra.doantotnghiep2025nhc.service.CategoryService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponseDTO> getAllActiveCategories() {
        List<Category> categories = categoryRepository.findByStatusTrue()
                .stream()
                .filter(Category::isStatus)
                .collect(Collectors.toList());

        return categories.stream().map(category -> CategoryResponseDTO.builder()
                        .categoryId(category.getCategoryId())
                        .categoryName(category.getCategoryName())
                        .description(category.getCategoryDescription())
                        .status(category.isStatus())
                        .build())
                .collect(Collectors.toList());
    }


}
