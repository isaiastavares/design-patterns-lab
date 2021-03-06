/**
 * @author isaias.neto
 * Quando usar Interpreter?
 * 
 * O padrão Interpreter é geralmente útil para interpretar DSLs (se você não sabe o que é uma DSL, 
 * pode ler mais sobre isso aqui: http://pt.wikipedia.org/wiki/Linguagem_de_dom%C3%ADnio_espec%C3%ADfico. 
 * É comum que, ao ler a string (como por exemplo 2+3/4), o programa transforme-o em uma melhor estrutura 
 * de dados (como as nossas classes Expressao) e aí interprete essa árvore.
 * 
 * É realmente um padrão de projeto bem peculiar, e com utilização bem específica.
 */
package br.com.alura.dp.interpreter;