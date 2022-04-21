class Car:
    'This is car class'

    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer+" "+self.model+" stared moving")
    def stop(self):
        print(self.manufacturer+" "+self.model+" stopped moving")

car1 = Car("Toyota","Corola","2015","Manual","white")
car2 = Car("Tata","Nexon","2020","Manual","Blue")
car3 = Car("Maruti","800","2007","Electric","Red")

print(car1)
car1.accelerate()
car1.stop()
