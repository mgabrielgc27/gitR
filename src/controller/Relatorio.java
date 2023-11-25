package controller;

public class Relatorio {
	
	protected String nome = "Marcos Gabriel";
	protected String matricula = "554844";
	protected String arquivo;
	protected int[] bugsPlanetas = new int[7];
	protected int[] devsPlanetas = new int[7];
	protected int[] veloPlanetas = new int[7];
	protected int[] diasPlanetas = new int[7];
	protected int[] anosPlanetas = new int[7];
	protected int[] bugsQuadrantes = new int[4];
	protected int[] devsQuadrantes = new int[4];
	
	public Relatorio(Memoria memoria) {
		
		arquivo = memoria.diretorioArquivoEntrada;
		System.out.println(nome+"\n"+matricula+"\n"+arquivo);
		
		for (int i = 0; i < bugsPlanetas.length; i++) {
			bugsPlanetas[i] = memoria.getJava().getPlanetas().get(i).getQuantColisoesComBugs();
			System.out.print("Col bugs: "+bugsPlanetas[i]+" - ");
		}
		System.out.println();
		for (int i = 0; i < devsPlanetas.length; i++) {
			devsPlanetas[i] = memoria.getJava().getPlanetas().get(i).getQuantColisoesComDevs();
			System.out.print("Col devs: "+devsPlanetas[i]+" - ");
		}
		System.out.println();
		veloPlanetas = memoria.calcularVelocidadeMedia(memoria.getJava().getPlanetas());
		for (int i = 0; i < veloPlanetas.length; i++) {
			System.out.print("VelMedia: "+veloPlanetas[i]+" - ");
		}
		System.out.println();
		diasPlanetas = memoria.calcularDiasPassados(memoria.getJava().getPlanetas());
		for (int i = 0; i < diasPlanetas.length; i++) {
			System.out.print("Dias: "+diasPlanetas[i]+" - ");
		}
		System.out.println();
		anosPlanetas = memoria.calcularAnosPassados(memoria.getJava().getPlanetas());
		for (int i = 0; i < anosPlanetas.length; i++) {
			System.out.print("Anos: "+anosPlanetas[i]+" - ");
		}
		System.out.println();
		bugsQuadrantes = memoria.BugsQuadrantes(memoria.getJava().getAstros());
		for (int i = 0; i < bugsQuadrantes.length; i++) {
			System.out.print("Bugs Qua"+(i+1)+": "+bugsQuadrantes[i]+" - ");
		}
		System.out.println();
		devsQuadrantes = memoria.DevsQuadrantes(memoria.getJava().getAstros());
		for (int i = 0; i < devsQuadrantes.length; i++) {
			System.out.print("Devs Qua"+(i+1)+": "+devsQuadrantes[i]+" - ");
		}
		System.out.println();
	}
}
