# 1-800-PHONE-WORD

**How to Run**

1) Read input from console and use inbuilt dictionary
```
java -jar phoneword-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

2) Read input from file and use inbuilt dictionary

```
java -jar phoneword-0.0.1-SNAPSHOT-jar-with-dependencies.jar <input_file>
```

3) Read input from console and use supplied dictionary file

```
java -jar -Ddict.file=<dictionary_file>  phoneword-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

4) Read input from file and use supplied dictionary file

```
java -jar -Ddict.file=<dictionary_file> phoneword-0.0.1-SNAPSHOT-jar-with-dependencies.jar <input_file>
```


**Sample Output**
```
Match Found for Number : 1-800-2255.63
1-800-CALL-ME
Match Found for Number : 2255.63
1-800-CALL-ME
Match Found for Number : 27753
1-800-APPLE
Match Found for Number : 52696
1-800-5-AMZN
Match Found for Number : 8378
1-800-TEST
1-800-UEST
No Match Found for Number : 8278

```
