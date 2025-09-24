package vn.Controller.admin;

import vn.Service.Impl.ICategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/categories")
public class CategoryPageController {

    private final ICategoryService categoryService;

    public CategoryPageController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // GET /admin/categories/list  ->  templates/admin/categories/list.html
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "admin/categories/list";
    }
}
