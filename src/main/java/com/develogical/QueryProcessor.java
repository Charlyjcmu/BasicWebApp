package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("byron")) {
            return "Lord Byron was a poet";
        }
        if (query.toLowerCase().contains("your name")) {
            return "jhcjrr";
        }
        if (query.toLowerCase().contains("Eiffel")) {
            return "Paris";
        }
        if (query.toLowerCase().contains("plus")) {
            String queryWithSpace = query.replaceAll("%20"," ");
            String[] parts = queryWithSpace.split(" ");
            int n1 = Integer.parseInt(parts[2]);
            int n2 = Integer.parseInt(parts[4]);
            int sum = n1+n2;
            return String.valueOf(sum);
        }
        if (query.toLowerCase().contains("multiplied")) {
            String queryWithSpace = query.replaceAll("%20"," ");
            String[] parts = queryWithSpace.split(" ");
            int n1 = Integer.parseInt(parts[2]);
            int n2 = Integer.parseInt(parts[5]);
            int product = n1*n2;
            return String.valueOf(product);
        }
        if (query.toLowerCase().contains("minus")) {
            String queryWithSpace = query.replaceAll("%20"," ");
            String[] parts = queryWithSpace.split(" ");
            int n1 = Integer.parseInt(parts[2]);
            int n2 = Integer.parseInt(parts[4]);
            int min = n1-n2;
            return String.valueOf(min);
        }
        if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }
        return "";
    }
}
