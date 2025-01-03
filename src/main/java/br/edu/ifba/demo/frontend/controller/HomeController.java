package br.edu.ifba.demo.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifba.demo.frontend.dto.LivroDTO;
import br.edu.ifba.demo.frontend.service.LivroService;


@Controller
public class HomeController {
    @Autowired
    
    private LivroService livroService;
    
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("livros");
        return mv;
    }
    /* Método para salvar livro */
    @PostMapping("/livro/save")
    public String save(@ModelAttribute LivroDTO livroDTO) {
        livroService.save(livroDTO); // Envia os dados para o serviço
        return "redirect:/livro/listall"; // Redireciona para a listagem após salvar
    }

    /* Listar livros */
     @GetMapping("/livro/listall")
     public ModelAndView livros() {
        List<LivroDTO> livro = livroService.listAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("listaLivros", livro);
        mv.setViewName("livros");
        return mv;
    }
    
   /* Buscar por título */
@GetMapping("/livros/findByTitulo/{titulo}")
public ModelAndView getByTitulo(@PathVariable("titulo") String titulo) {
    LivroDTO livro1 = livroService.getByTitulo(titulo);
    ModelAndView mv = new ModelAndView();
    if (livro1 != null) {
        mv.addObject("listaLivros", List.of(livro1)); // Atualiza a lista para exibir o resultado
    } else {
        mv.addObject("errorMessage", "Livro não encontrado!");
    }
    mv.setViewName("livros");
    return mv;
}

        /* buscar por isbn */
     @GetMapping("/livro/findByIsbn/{isbn}")
     public ModelAndView getByIsbn(@RequestParam("isbn") String isbn) {
            LivroDTO livro2 = livroService.getByIsbn(isbn);
            ModelAndView mv = new ModelAndView();
            mv.addObject("livro.isbn", livro2);
            mv.setViewName("livros");
            return mv;
        }

        /* Buscar livro por ID */
        @GetMapping("/livro/findById/{id}")
        public ModelAndView getById(@RequestParam("id") Long id) {
            LivroDTO livro = livroService.getById(id);
            ModelAndView mv = new ModelAndView();
            if (livro != null) {
                mv.addObject("listaLivros", List.of(livro)); // Atualiza a lista para exibir o resultado
            } else {
                mv.addObject("errorMessage", "Livro não encontrado!");
            }
            mv.setViewName("livros");
            return mv;
        }
        
        
        /* Excluir livro */
     @GetMapping("/livro/delete/{id}")
     public String delete(@RequestParam("id") Long id) {
        livroService.delete(id);
        return "redirect:/livro/listall";
        }
   
    

}
