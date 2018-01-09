/**
 * @author isaias.neto
 * Diferença entre Factory e Flyweight
 * 
 * Uma Factory instancia uma classe que é importante/complexa, e seu processo de criação deve ser isolado.
 * 
 * Um Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, 
 * e precisamos economizar. Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias.
 * 
 * Diferença de Flyweight e Singleton
 * 
 * A ideia de ambos é garantir que existam apenas uma única referência para o objeto ao longo do programa.
 * 
 * A diferença é que o Flyweight garante que existam apenas uma única instância de vários elementos. É um "singleton maior".
 */
package br.com.alura.dp.flyweight;