package org.example;

import org.example.classes.*;

public class Main {
    public static void main(String[] args) {
        Obra obra = new Obra("123",
                "Senhor do Aneis",
                "Tolkien",
                "Tolkien",
                "1960",
                "Terra Média",
                "12345");

        obra.mostrar();

        System.out.println("\n\n");

        Leitor leitor = new Leitor("12345",
                "miguel",
                "miguel@email.com",
                "12345-6789",
                "12-12312312");

        leitor.mostrar();

        System.out.println("\n\n");

        categoriaObra catObra = new categoriaObra("321",
                "Ficção");

        catObra.mostrar();

        System.out.println("\n\n");

        Copia copia = new Copia("123",
                "Reservado",
                "Emprestado pra Miguel");

        copia.mostrar();

        System.out.println("\n\n");

        Emprestimo emprestimo = new Emprestimo("123",
                "20250101",
                "20250107",
                "20250105",
                0,
                "Devolvido");

        emprestimo.mostrar();

        System.out.println("\n\n");

        Funcionario funcionario = new Funcionario("54321",
                "Marcio",
                "marcio@email.com",
                "21-432124321",
                "98-76543221",
                "Bibliotecário");

        funcionario.mostrar();

        System.out.println("\n\n");

        Reserva reserva = new Reserva("123",
                "20250102",
                "20250107",
                "Emprestado");

        reserva.mostrar();
    }
}
