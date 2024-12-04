package br.edu.ifba.demo.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifba.demo.frontend.dto.LivroDTO;
import br.edu.ifba.demo.frontend.service.LivroService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

   /* Listar livros */
     @GetMapping
     public ModelAndView livros() {
        List<LivroDTO> livros = livroService.listAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("listaLivros", livros);
        mv.setViewName("livros");
        return mv;
    }
}


