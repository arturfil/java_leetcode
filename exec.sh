

# command to compile Main.java => Main.class which is java bytecode interpreted by JVM. 
# (not need to understand, to run the code but it's interesting)
javac Main.java 

# Runs the bytecode Main.class but can be abreviated as so:
java Main

# Delte all the compiled .class files after we finsh in case 
# we make future changess
find . -type f -path "./*" -name "*.class" -delete 
