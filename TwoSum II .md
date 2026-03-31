SORTED ARRAY  +   CONSTANT SPACE

STEP 1  :    int left = 0;

👉 Left pointer start se (smallest element)

🔹STEP  2 :    int right = numbers.length - 1;

👉 Right pointer end se (largest element)

👉 Example:

[2, 7, 11, 15]
 L          R


🔹 while(left < right)

👉 Jab tak dono pointers cross nahi hote tab tak loop chalega



🔹 int sum = numbers[left] + numbers[right];

👉 Dono pointer ke numbers ka sum



🔹 if(sum == target)

👉 Agar sum mil gaya → answer return



🔹 return new int[]{left + 1, right + 1};

👉 Important ⚠️

Question me 1-based indexing hai
Isliye +1 karna padega

👉 Example:

left = 0 → index = 1
right = 1 → index = 2


🔹 else if(sum < target)

👉 Sum chhota hai → bada number chahiye
👉 Left pointer ko right move karo

left++;


🔹 else

👉 Sum bada hai → chhota number chahiye
👉 Right pointer ko left move karo

right--;



🔹 return new int[]{-1, -1};

👉 Just fallback (normally kabhi use nahi hoga)




🔍 Dry Run (Example 1)
Input:
numbers = [2,7,11,15]
target = 9
Step-by-step:

👉 left = 0 (2), right = 3 (15)
sum = 17 ❌ → bada hai → right--

👉 left = 0 (2), right = 2 (11)
sum = 13 ❌ → right--

👉 left = 0 (2), right = 1 (7)
sum = 9 ✅

👉 return:

[1,2]


🔥 Key Logic (Golden Rule)
Condition	Action
sum == target	return
sum < target	left++
sum > target	right--
