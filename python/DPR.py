class DPR:
    def __init__(self, id=0, name="", namaBidang="", partai=""):
        self.id = id
        self.name = name
        self.namaBidang = namaBidang
        self.partai = partai

    def get_Id(self):
        return self.id

    def set_Id(self, id):
        self.id = id

    def get_Name(self):
        return self.name

    def set_Name(self, name):
        self.name = name

    def get_namaBidang(self):
        return self.namaBidang

    def set_namaBidang(self, namaBidang):
        self.namaBidang = namaBidang

    def get_Partai(self):
        return self.partai

    def set_Partai(self, partai):
        self.partai = partai
