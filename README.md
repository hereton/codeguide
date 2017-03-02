#Code guidance.

## 1) DRY (Don't repeat yourself)
- It's means don't write duplicate code. It's important not to abuse it, duplication is not for code, but for functionality .
For example 

```

        int x = 1, y = 2;

		if (x < y) {
			x = x + 1;
			System.out.println(x); // ---> Duplicate code.
		} else {
			x = x - 1;
			System.out.println(x); // ---> Duplicate code.
		}

	}
```	
A DRY code.
```	
		
        int x = 1, y = 2;

		if (x < y) {
			x = x + 1;
		} else {
			x = x - 1;
		}
		System.out.println(x); // ---> 2  
```		
Read more: http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html#ixzz4aANSU1XE
