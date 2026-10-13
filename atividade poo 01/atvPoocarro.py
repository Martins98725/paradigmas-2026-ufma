class FichaCarro:

    placa: str
    km: float
    chassi: str
    modelo: str
    anoFabricacao: int
    donoCarro: str
    revisaoCarro: bool
    propulsao: str

    def adicionarFichaCarro(self):
        print("Ficha do carro adicionada")

    def atualizaFichaCarro(self):
        print("Ficha do carro atualizada")

    def isRevisaoCarro(self):
        return self.revisaoCarro

    def excluirFichaCarro(self):
        print("Ficha do carro excluida")

    def listarFichasCarros(self):
        print("Listando todas as fichas de carros")

    def listarFichasDeCarroPorDono(self):
        print("Listando fichas de carros por dono:")