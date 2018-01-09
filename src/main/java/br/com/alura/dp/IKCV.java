package br.com.alura.dp;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue10ReaisNo(orcamento);
	}
	
	private boolean temItemMaiorQue10ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

}
