/*  1. Vocês deverão se reunir em equipes de até 05 pessoas, ou seja equipe <= 5.

2. Cada equipe deverá implementar o último exercício da Aula 05 (https://github.com/EvandroJRSilva/POO_ED/tree/main/src/aula05/texto)
2.1. Na classe ContaBancaria vocês 
    2.1.1. Vocês deverão acrescentar atributo(s) e método(s) para saque, depósito e atualização de valores 
    do saldo. Não esquecer do método aplicaJuros existente na classe ContaPoupanca,
     ou seja, é um método que deve ser aplicado ao montante presente na conta do usuário.
2.2. Na classe Principal 
    2.2.1. Vocês deverão criar três objetos da classe Funcionario. Os valores para os atributos do primeiro 
    objeto vocês mesmos escolherão. Os valores para os atributos dos dois outros objetos devem ser 
    preenchidos pelo usuário através de leitura no console.
    2.2.2. Criar uma empresa qualquer, como instância da classe PessoaJuridica.
    2.2.3. Imprimir no console o nome de cada funcionário e dizer que são funcionários da empresa recém criada.
     Utilize os métodos getters para ter acesso aos nomes.
    2.2.4. Permita a um usuário escolher, via console, dois funcionários e realizar manipulações entre eles, 
    desde modificar valores de atributos como também um depositar na conta do outro, etc.
    2.2.5. Ao fim do programa, devem ser impressos no console todos os objetos criados e seus respectivos valores.

3. A data de entrega será 19/10/23, ou seja na próxima quinta.
3.1. Cada grupo deverá criar um arquivo zipado contendo apenas as classes criadas e enviar diretamente para mim pelo Telegram. Meu usuário: @evandro_jr_silva.
3.2. Na mensagem em que me enviarem o arquivo, deve constar também o nome completo de todos os membros da equipe.
3.3. O horário limite para entrega é as 23:59.

4. Este trabalho está valendo até 5 pontos a serem acrescentados à nota da prova.
4.1. Ou seja, supondo que você esteja com a nota 4, sua nota poderá subir até 9. */

import java.util.Scanner;
import Classes.Funcionario;
import Classes.PessoaJuridica;
import Classes.ContaBancaria;


public class App {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Funcionario  funcionario01 = new Funcionario("Elvis Presley", "Desembargador pereira 4277", 
            "elvispresley@gmail.com","86 99180452", "00465696341","2269526",
            "21291245", "CEO", "0001");
            funcionario01.setEmpresa(new PessoaJuridica ("Rock ando roll"));
            funcionario01.setConta(new ContaBancaria ("1135CC"));


            // nome, endereço,email,telefone,conta, cpf, cnh, rg, cargo, empresa, idFuncionario
            System.out.print("\n\n" +"Cadastrar Funcionario 2\n");
            System.out.print("Digite o nome do Funcionario 2: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o endereco do Funcionario 2: ");
            String endereco= scanner.nextLine();            
            System.out.print("Digite o email do Funcionario 2: ");
            String email = scanner.nextLine();
            System.out.print("Digite o telefone do Funcionario 2: ");
            String telefone = scanner.nextLine();
            System.out.print("Digite o conta do Funcionario 2: ");
            String conta = scanner.nextLine();
            System.out.print("Digite o cpf do Funcionario 2: ");
            String cpf= scanner.nextLine();
            System.out.print("Digite o cnh do Funcionario 2: ");
            String cnh = scanner.nextLine();
            System.out.print("Digite o rg do Funcionario 2: ");
            String rg= scanner.nextLine();            
            System.out.print("Digite o cargo do Funcionario 2: ");
            String cargo = scanner.nextLine();
            System.out.print("Digite o id do Funcionario 2: ");
            String id= scanner.nextLine();
            System.out.print("Digite a empresa do Funcionario 2: ");
            String empresa= scanner.nextLine();
            
            Funcionario funcionario02 = new Funcionario( nome, endereco, email, telefone, cpf, cnh, rg, cargo, id);
            funcionario02.setEmpresa(new PessoaJuridica (empresa));
            funcionario02.setConta(new ContaBancaria (conta));


            System.out.print("\n\n" + "Cadastrar Funcionario 3\n");
            System.out.print("Digite o nome do Funcionario 3: ");
            String nome3 = scanner.nextLine();
            System.out.print("Digite o endereco do Funcionario 3: ");
            String endereco3= scanner.nextLine();            
            System.out.print("Digite o email do Funcionario 3: ");
            String email3 = scanner.nextLine();
            System.out.print("Digite o telefone do Funcionario 3: ");
            String telefone3 = scanner.nextLine();
            System.out.print("Digite o conta do Funcionario 3: ");
            String conta3 = scanner.nextLine();
            System.out.print("Digite o cpf do Funcionario 3: ");
            String cpf3= scanner.nextLine();
            System.out.print("Digite o cnh do Funcionario 3: ");
            String cnh3 = scanner.nextLine();
            System.out.print("Digite o rg do Funcionario 3: ");
            String rg3= scanner.nextLine();            
            System.out.print("Digite o cargo do Funcionario 3: ");
            String cargo3 = scanner.nextLine();
            System.out.print("Digite o id do Funcionario 3: ");
            String id3= scanner.nextLine();
            System.out.print("Digite a empresa do Funcionario 3: ");
            String empresa3= scanner.nextLine();
            


            Funcionario funcionario03 = new Funcionario( nome3, endereco3, email3, telefone3, cpf3, cnh3, rg3, cargo3, id3);
            funcionario03.setEmpresa(new PessoaJuridica (empresa3));
            funcionario03.setConta(new ContaBancaria (conta3));

            System.out.print("\n\n" + "Cadastrar empresa" + "\n");
            System.out.print("Nome da empresa: ");
            String nomeempresa = scanner.nextLine();
            System.out.print("Digite o endereco da empresa: ");
            String enderecoempresa= scanner.nextLine();            
            System.out.print("Digite o email da empresa: ");
            String emailempresa = scanner.nextLine();
            System.out.print("Digite o telefone da empresa: ");
            String telefoneempresa = scanner.nextLine();
            System.out.print("Digite o conta do da empresa: ");
            String contaempresa = scanner.nextLine();
            System.out.print("Digite o tipo da empresa: ");
            String tipoempresa= scanner.nextLine();
            System.out.print("Digite o cnpj da empresa: ");
            String cnpj = scanner.nextLine();
            System.out.print("Digite o Nome Fantasia da empresa: ");
            String fantasia= scanner.nextLine();            
            

            PessoaJuridica empresa1 = new PessoaJuridica(nomeempresa, enderecoempresa, emailempresa, 
            telefoneempresa, tipoempresa, cnpj, fantasia);
            empresa1.setConta(new ContaBancaria (contaempresa));

            System.out.print("\n\n" +"Lista de Funcionarios e Empresas\n");
            System.out.print("\n" + "Nome: " + funcionario01.getNome() + " Empresa: " + funcionario01.getEmpresa().getNome() + "\n" );
            System.out.print("\n" + "Nome: " + funcionario02.getNome() + " Empresa: " + funcionario02.getEmpresa().getNome() + "\n");
            System.out.print("\n" + "Nome: " + funcionario03.getNome() + " Empresa: " + funcionario03.getEmpresa().getNome() + "\n");
            
            
            System.out.print("\n" + "Empresa Criada\n");
            System.out.print("Nome: " + empresa1.getNome() + " Nome Fantasia: " + empresa1.getFantasia() + "\n");

            if (empresa1.getNome().equals(funcionario01.getEmpresa().getNome())) {
                System.out.print(funcionario01.getNome() + " e Funcionario da empresa criada\n");
            } 
            
            if (empresa1.getNome().equals(funcionario02.getEmpresa().getNome())) {
                System.out.print(funcionario02.getNome() + " e Funcionario da empresa criada\n");
            } 

            if (empresa1.getNome().equals(funcionario03.getEmpresa().getNome())){
                System.out.print(funcionario03.getNome() + " e Funcionario da empresa criada\n");
            } 

            
            boolean menu = true;

            while (menu == true){
                System.out.print("\n\nQuer alterar algum Dado? [S/N] ");
                String altera = scanner.nextLine();  
                if (altera.equals("S")){
                    System.out.print("Quer Funcionário01? [S/N] ");
                    String altera1= scanner.nextLine();
                    if (altera1.equals("S")){
                        System.out.print("Digite o nome do Funcionario 1: ");
                        String nome1a = scanner.nextLine();                    
                        System.out.print("Digite a empresa do Funcionario 1: ");
                        String empresa1a= scanner.nextLine();
                        
                        funcionario01.setNome(nome1a);
                        funcionario01.setEmpresa(new PessoaJuridica (empresa1a));
                    }  
                    System.out.print("Quer Funcionário02? [S/N] ");
                    String altera2= scanner.nextLine();
                    if (altera2.equals("S")){
                        System.out.print("Digite o nome do Funcionario 2: ");
                        String nome2a = scanner.nextLine();                    
                        System.out.print("Digite a empresa do Funcionario 2: ");
                        String empresa2a= scanner.nextLine();
                        
                        funcionario02.setNome(nome2a);
                        funcionario02.setEmpresa(new PessoaJuridica (empresa2a));
                    }
                    System.out.print("Quer Funcionario03? [S/N] ");
                    String altera3= scanner.nextLine();
                    if (altera3.equals("S")){
                        System.out.print("Digite o nome do Funcionario 3: ");
                        String nome3a = scanner.nextLine();                    
                        System.out.print("Digite a empresa do Funcionario 3: ");
                        String empresa3a= scanner.nextLine();
                        
                        funcionario01.setNome(nome3a);
                        funcionario01.setEmpresa(new PessoaJuridica (empresa3a));
                        }  
                
                } else if (altera.equals("N")) {
                menu = false;
                }  
            }
          

            System.out.print("\nVamos depositar os Salários: ");
            System.out.print("\nA " + empresa1.getNome() + " vai depositar para o " + funcionario01.getNome() +  " o valor de (R$): ");
            double salario01 = scanner.nextDouble();
            empresa1.getConta().saque(salario01);
            funcionario01.getConta().deposito(salario01);

            System.out.print("\nA " + empresa1.getNome() + " vai depositar para o " + funcionario02.getNome() + " o valor de (R$): ");
            double salario02 = scanner.nextDouble();
            empresa1.getConta().saque(salario02);
            funcionario02.getConta().deposito(salario02);

            System.out.print("\nA " + empresa1.getNome() + " vai depositar para o " + funcionario03.getNome() + " o valor de (R$): ");
            double salario03 = scanner.nextDouble();
            empresa1.getConta().saque(salario03);
            funcionario02.getConta().deposito(salario03);

            // nome, endereço,email,telefone,conta, cpf, cnh, rg, cargo, empresa, idFuncionario
            System.out.print("Lista de Funcionarios cadastrados: ");
            System.out.print("\n\nNome:" + funcionario01.getNome() + " Endereco:" + funcionario01.getEndereco() + " Email : " + funcionario01.getEmail() + " Telefone: " + 
            funcionario01.getTelefone() + " Conta: " +  funcionario01.getConta().getNumero() + " Saldo: " + 
            funcionario01.getConta().getSaldo() + " CPF " + funcionario01.getCpf() + " CNH: " + funcionario01.getCnh() + " RG: " + funcionario01.getRg()
            + " Cargo: " + funcionario01.getCargo() + "Empresa: " + funcionario01.getEmpresa().getNome() + " ID " + funcionario01.getIdFuncionario());

            System.out.print("\n\nNome:" + funcionario02.getNome() + " Endereco:" + funcionario02.getEndereco() +  " Email : " + funcionario02.getEmail() + " Telefone: " + 
            funcionario02.getTelefone() + " Conta: " +  funcionario02.getConta().getNumero() + " Saldo: " + 
            funcionario02.getConta().getSaldo() + " CPF " + funcionario02.getCpf() + " CNH: " + funcionario02.getCnh() + " RG: " + funcionario02.getRg()
            + " Cargo: " + funcionario02.getCargo() + "Empresa: " + funcionario02.getEmpresa().getNome() + " ID " + funcionario02.getIdFuncionario());

            System.out.print("\n\nNome:" + funcionario03.getNome() + " Endereco:" + funcionario03.getEndereco() +  " Email : " + funcionario03.getEmail() + " Telefone: " + 
            funcionario03.getTelefone() + " Conta: " +  funcionario03.getConta().getNumero() + " Saldo: " + 
            funcionario03.getConta().getSaldo() + " CPF " + funcionario03.getCpf() + " CNH: " + funcionario03.getCnh() + " RG: " + funcionario03.getRg()
            + " Cargo: " + funcionario03.getCargo() + "Empresa: " + funcionario03.getEmpresa().getNome() + " ID " + funcionario03.getIdFuncionario());

            System.out.print("Lista de Empresas cadastradas: ");

            // (nomeempresa, enderecoempresa, emailempresa, telefoneempresa, tipoempresa, cnpj, fantasia)

            System.out.print("\n\nNome:" + empresa1.getNome() + " Endereco:" + empresa1.getEndereco() +  " Email : " + empresa1.getEmail() + " Telefone: " + 
            empresa1.getTelefone() + " Conta: " +  empresa1.getConta().getNumero() + " Saldo: " + 
            empresa1.getConta().getSaldo() + " Cnpj " + empresa1.getCnpj() + " Tipo: " + empresa1.getTipo() + " Nome Fantasia: " + empresa1.getFantasia()
            );

            scanner.close();

    }
}
