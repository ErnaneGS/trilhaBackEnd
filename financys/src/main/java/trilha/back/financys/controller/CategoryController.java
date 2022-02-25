package trilha.back.financys.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Category;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private List<Category> listaCategory = new ArrayList<Category>();

    @PostMapping
    public String create(@RequestBody Category category) {



        listaCategory.add(category);

        return "Categoria inserida na lista na posição " + listaCategory.size();

    }

    @GetMapping
    public ResponseEntity<List> read() {

        return ResponseEntity.ok(listaCategory);
    }

}
