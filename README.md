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
		System.out.println(x); // the result is the same. 
		}
```		
## 2) Always do a java doc
- You should describe what is your code purpose or do. For example 
```
 	 /**
	 * Return the capacity of the coin purse.
	 * 
	 * @return the capacity
	 */
	public int getCapacity() {
		return this.capacity;
	}
```
## 3) Avoid Deep Nesting 
- Too many levels of nesting can make code harder to read and follow. For example.
```
if (...) {
        if (...) {
             if (...) {
                 if (...) {
 
                    // ...
 
                } else {
                    ...;
                }
            } else {
                ...;
            }
        } else {
            ...;
        }
    } else {
        return false;
    }
}
```
## 4) Code Refactoring
- When you "refactor," you make changes to the code without changing any of its functionality. You can think of it like a "clean up," for the sake of improving readability and quality.
For example.
```
int inputnumber = 10;
		String answerofsolution = "";
		if (inputnumber % 2 == 0) {
			answerofsolution = "even number";
		} else {
			answerofsolution = "not even number";
		}
		System.out.println(answerofsolution); 
```
- Clean up
```
int input = 10;
		if (input % 2 == 0) {
			System.out.println("even number");
		} else {

			System.out.println("not even number");
		}
```
## Useful references
Read more: https://code.tutsplus.com/tutorials/top-15-best-practices-for-writing-super-readable-code--net-8118
Read more: Big java page 186. - duplicate code.
Read more: http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html#ixzz4aANSU1XE
