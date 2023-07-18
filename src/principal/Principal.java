package principal;

import java.util.Scanner;

import classes.Carro;
import classes.Moto;
import implementacoes.CarroImplementacoes;
import implementacoes.MotoImplementacoes;

public class Principal {

	public static void main(String[] args) throws Exception {
		Carro carro = new Carro();
		Moto moto = new Moto();
		CarroImplementacoes ci = new CarroImplementacoes();
		MotoImplementacoes mi = new MotoImplementacoes();
		Scanner leitor = new Scanner(System.in);
		char ligarDesligar, acoes, carroMoto;

		System.out.println("Digite 1 para ligar o sistema");
		ligarDesligar = leitor.next().charAt(0);

		while (ligarDesligar == '1') {
			System.out.println("--- Loja de Veículos ---");
			System.out.println("Digite '1' para adicionar um novo carro ou uma nova moto");
			System.out.println("Digite '2' para atualizar um carro ou moto");
			System.out.println("Digite '3' para vender um carro ou moto");
			System.out.println("Digite '4' para listar todos os carros ou motos");
			System.out.println("Digite '5' para desligar o sistema");
			acoes = leitor.next().charAt(0);

			switch (acoes) {
			case '1':
				System.out.println("Digite 'C' para carro ou 'M' para moto: ");
				carroMoto = leitor.next().charAt(0);

				if (carroMoto == 'c') {
					leitor.nextLine();
					
					System.out.println("Digite a marca: ");
					carro.setMarca(leitor.nextLine());
					System.out.println("Digite o modelo: ");
					carro.setModelo(leitor.nextLine());
					System.out.println("Digite a cor: ");
					carro.setCor(leitor.nextLine());
					System.out.println("Digite o ano de fabricação: ");
					carro.setAno(leitor.nextInt());
					System.out.println("Digite a quilometragem: ");
					carro.setKm(leitor.nextInt());
					leitor.nextLine();
					System.out.println("Digite o câmbio: ");
					carro.setCambio(leitor.nextLine());
					System.out.println("Digite a carroceria: ");
					carro.setCarroceria(leitor.nextLine());

					ci.criarCarro(carro);
					System.out.println("Carro criado com sucesso!");

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				} else if (carroMoto == 'm') {
					leitor.nextLine();
					
					System.out.println("Digite a marca: ");
					moto.setMarca(leitor.nextLine());
					System.out.println("Digite o modelo: ");
					moto.setModelo(leitor.nextLine());
					System.out.println("Digite a cor: ");
					moto.setCor(leitor.nextLine());
					System.out.println("Digite o ano: ");
					moto.setAno(leitor.nextInt());
					System.out.println("Digite a quilometragem: ");
					moto.setKm(leitor.nextInt());
					System.out.println("Digite a cilindrada: ");
					moto.setCilindrada(leitor.nextInt());

					mi.criarMoto(moto);
					System.out.println("Moto criada com sucesso!");

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				}
				break;
			case '2':
				System.out.println("Digite 'C' para carro ou 'M' para moto: ");
				carroMoto = leitor.next().charAt(0);

				if (carroMoto == 'c') {
					leitor.nextLine();

					System.out.println("Digite o ID: ");
					carro.setId(leitor.nextInt());
					leitor.nextLine();
					System.out.println("Digite a marca: ");
					carro.setMarca(leitor.nextLine());
					System.out.println("Digite o modelo: ");
					carro.setModelo(leitor.nextLine());
					System.out.println("Digite a cor: ");
					carro.setCor(leitor.nextLine());
					System.out.println("Digite o ano de fabricação: ");
					carro.setAno(leitor.nextInt());
					System.out.println("Digite a quilometragem: ");
					carro.setKm(leitor.nextInt());
					leitor.nextLine();
					System.out.println("Digite o câmbio: ");
					carro.setCambio(leitor.nextLine());
					System.out.println("Digite a carroceria: ");
					carro.setCarroceria(leitor.nextLine());

					ci.atualizarCarro(carro);
					System.out.println("Carro atualizado com sucesso!");

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				} else if (carroMoto == 'm') {
					leitor.nextLine();

					System.out.println("Digite o ID: ");
					moto.setId(leitor.nextInt());
					leitor.nextLine();
					System.out.println("Digite a marca: ");
					moto.setMarca(leitor.nextLine());
					System.out.println("Digite o modelo: ");
					moto.setModelo(leitor.nextLine());
					System.out.println("Digite a cor: ");
					moto.setCor(leitor.nextLine());
					System.out.println("Digite o ano: ");
					moto.setAno(leitor.nextInt());
					System.out.println("Digite a quilometragem: ");
					moto.setKm(leitor.nextInt());
					System.out.println("Digite a cilindrada: ");
					moto.setCilindrada(leitor.nextInt());

					mi.atualizarMoto(moto);
					System.out.println("Moto atualizada com sucesso!");

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				}
				break;
			case '3':
				System.out.println("Digite 'C' para carro ou 'M' para moto: ");
				carroMoto = leitor.next().charAt(0);

				if (carroMoto == 'c') {

					carro.venderVeiculo();

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				} else if (carroMoto == 'm') {

					moto.venderVeiculo();

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				}
				break;
			case '4':
				System.out.println("Digite 'C' para carro ou 'M' para moto: ");
				carroMoto = leitor.next().charAt(0);

				if (carroMoto == 'c') {
					ci.ListarCarros();

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				} else if (carroMoto == 'm') {
					mi.ListarMotos();

					System.out.println("Digite 1 para voltar ao menu principal ou 2 para desligar: ");
					ligarDesligar = leitor.next().charAt(0);
				}
				break;
			case '5':
				System.out.println("Obrigado por usar o sistema! Desligando...");
				System.exit(0);
			default:
				System.out.println("Botão inválido! Tente novamente.");
			}
		}
	}
}
