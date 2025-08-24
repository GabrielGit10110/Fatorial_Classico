# 1. Compile all the files into a file.class inside dist
javac -s src -d dist src/view/Fatorial.java src/controller/FatorialController.java

# 2. Run it with:

java -cp dist view.Fatorial

---

*optional*

# 1. Compile into a jar file:

jar cvmf Fatorial.jar manifest.md dist .

# 2. Run the .jar:

java -jar Fatorial.jar
