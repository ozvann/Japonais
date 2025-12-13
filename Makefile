### VARIABLES ###
# Commande compilation
JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none
JCPATH = -d build -sourcepath src
SRC_PATH = src/
BUILD_PATH = build/
# Commande d'exécution
JVM = java

### REGLES ESSENTIELLES ###

$(BUILD_PATH)Main.class: $(SRC_PATH)Main.java $(BUILD_PATH)Menu.class
	@if not exist $(@D) mkdir $(@D)
	$(JC) $(JCFLAGS) $(JCPATH) $(SRC_PATH)Main.java

$(BUILD_PATH)Menu.class: $(SRC_PATH)Menu.java $(BUILD_PATH)Fenetre.class
	@if not exist $(@D) mkdir $(@D)
	$(JC) $(JCFLAGS) $(JCPATH) $(SRC_PATH)Menu.java

$(BUILD_PATH)Fenetre.class: $(SRC_PATH)Fenetre.java
	@if not exist $(@D) mkdir $(@D)
	$(JC) $(JCFLAGS) $(JCPATH) $(SRC_PATH)Fenetre.java

### REGLES OPTIONNELLES ###
run: 
	$(JVM) $(BUILD_PATH)Main

clean:
	-rmdir /s /q build

mrproper: clean all

### BUTS FACTICES ###
.PHONY: run clean mrproper jar run-jar
