# Duplicate Checker

**Can the program handle million of records?**

Using a LinkedHashSet or TreeMap, the program is able to remove duplicates and ensure the sorting order is maintained.

LinkedHashSet

```
LinkedHashSet<String> emailSet = new LinkedHashSet<String>();

        for (int i = 0; i < emailArray.length; i++) {
            emailSet.add(emailArray[i].toLowerCase());
        }
```

TreeMap

```
Map<String, Contact> contactMap = new TreeMap<String, Contact>(Collections.reverseOrder());

        contactMap.put(con1.email, con1);
        contactMap.put(con2.email, con2);
        contactMap.put(con3.email, con3);
        contactMap.put(con4.email, con4);
```
# duplicate-checker
