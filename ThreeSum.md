# 3Sum

- Approach: Two Pointer
- TC: O(n^2)
- Mistake: '=' vs '=='
- step 1 : pehle array ko sort krenge
- step 2: goal a[i]+a[left]+a[right]=0
- step 3 : check krnge ki teeno element apas m equal to n h
- step 4:iteration krenge loop ka or check krenge


CODE EXPLANATIONNNNNN

1    public List<List<Integer>> threeSum(int[] nums)

👉 Function:

Input → integer array nums
Output → list of triplets (List of List) 

2     List<List<Integer>> res = new ArrayList<>();

👉 Result store karne ke liye empty list banayi
Example:

[[-1,-1,2], [-1,0,1]]

3  Arrays.sort(nums);

👉 Array sort kiya

💡 Why important?

Two pointer tabhi kaam karega
Duplicate easily skip kar paoge

Example:

[-1,0,1,2,-1,-4] → [-4,-1,-1,0,1,2]


4     for(int i = 0; i < nums.length - 2; i++)

👉 Loop har element ko fix karne ke liye

💡 -2 kyun?

Hume 3 elements chahiye
last 2 ke baad possible hi nahi
🔹


5     if(i > 0 && nums[i] == nums[i - 1]) continue;

👉 Duplicate i skip kar rahe hain 🚨

💡 Example:

[-4,-1,-1,0,1,2]
        ↑  ↑
        same → skip second -1

👉 warna duplicate triplets aa jayenge


6     int left = i + 1;

👉 i ke baad se search start

🔹 int right = nums.length - 1;

👉 last element se start

🔹 while(left < right)

👉 Jab tak pointers cross nahi hote tab tak loop chalega

🔹 int sum = nums[i] + nums[left] + nums[right];

👉 Current triplet ka sum nikaala




7           MAIN LOGIC
✅ if(sum == 0)

👉 Perfect triplet mil gaya

res.add(Arrays.asList(nums[i], nums[left], nums[right]));

👉 Answer me add kar diya

🔹 left++; right--;

👉 Dono pointers move kiye

left → aage
right → peeche
🔹 Duplicate skip (left)
while(left < right && nums[left] == nums[left - 1]) left++;

👉 Same number repeat na ho

🔹 Duplicate skip (right)
while(left < right && nums[right] == nums[right + 1]) right--;

👉 Same reason

❌ else if(sum < 0)

👉 Sum chhota hai → badhana padega

👉 left++ (kyunki sorted array hai)

❌ else (sum > 0)

👉 Sum bada hai → kam karna padega

👉 right--

🔹 return res;

👉 Final answer return
