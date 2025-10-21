package com.Fastfood;

public class ComboFacade {
    private Combo combo;
    
    /**
     * Cria um combo baseado no código fornecido
     * @param codigo número do combo (1, 2 ou 3)
     */
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(
                    new Burger("Big Cheddar", 18.00),
                    new Bebida("Coca-Cola", 8.00),
                    new Sobremesa("Sundae", 9.90)
                );
                break;
            case 2:
                combo = new Combo(
                    new Burger("Mega Bacon", 16.00),
                    new Bebida("Guaraná", 7.50),
                    new Sobremesa("Torta de Maçã", 9.00)
                );
                break;
            case 3:
                combo = new Combo(
                    new Burger("Mini Burger", 12.00),
                    new Bebida("Suco Laranja", 6.00),
                    new Sobremesa("Sorvete", 4.90)
                );
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }
    
    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(combo.getBurger());
        System.out.println(combo.getBebida());
        System.out.println(combo.getSobremesa());
        System.out.println("==========================");
    }
    
   
    public double getPrecoTotal() {
        return combo != null ? combo.getPrecoTotal() : 0.0;
    }
  }
   
