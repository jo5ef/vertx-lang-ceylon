find src/test/ceylon/io/vertx/ceylon -name *.ceylon | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/test/ceylon
find src/test/ceylon/io/vertx/ceylon -name *.java | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/test/ceylon
ceylon compile --suppress-warning --javac=-target=8 --source=src/test/ceylon io.vertx.tests
