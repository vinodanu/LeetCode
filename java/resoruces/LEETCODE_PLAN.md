# LeetCode Interview Preparation - 8 Week Plan

**Target:** 90-100% interview problem coverage with ~85 strategically selected problems  
**Time Commitment:** 1-2 hours daily  
**Level:** Easy & Medium focus with Hard refinement  
**Status:** In Progress ⏳

**Progress:** 0/85 problems completed

---

## 📊 Quick Stats

| Week | Topic | Problems | Target | Completed |
|------|-------|----------|--------|-----------|
| 1-2 | Arrays, Strings, Hashing | 12 | Easy | 0 |
| 3-4 | Trees & DFS | 20 | Medium | 0 |
| 5-6 | Graphs & Topological Sort | 15 | Medium | 0 |
| 7 | Dynamic Programming | 15 | Medium | 0 |
| 8 | Mock Interviews & Hard | 23 | Hard | 0 |
| **Total** | | **85** | | **0** |

---

# WEEK 1-2: Arrays, Strings, Hashing (Warm-up)
**Focus:** Pattern recognition, hash maps, sliding window  
**Problems:** 12  
**Time per problem:** 25-30 min

## Day 1-2: Sliding Window Foundation

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 1 | 1 | Two Sum | Easy | Hash Map | ⬜ | Return indices of two numbers that sum to target |
| 2 | 242 | Valid Anagram | Easy | Hash Map / Frequency | ⬜ | Check if two strings are anagrams |
| 3 | 217 | Contains Duplicate | Easy | Hash Set | ⬜ | Check if array has any duplicate |
| 4 | 121 | Best Time to Buy and Sell Stock | Easy | Two Pointers | ⬜ | Track min, calculate max profit |

## Day 3-4: Sliding Window (Core Pattern)

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 5 | 3 | Longest Substring Without Repeating Characters | Medium | Sliding Window | ⬜ | **Most important** - appears in 30% of interviews |
| 6 | 239 | Sliding Window Maximum | Hard | Sliding Window + Deque | ⬜ | Advanced window variant |
| 7 | 76 | Minimum Window Substring | Hard | Sliding Window | ⬜ | Expansion/contraction pattern |
| 8 | 567 | Permutation in String | Medium | Sliding Window | ⬜ | Pattern matching variant |

## Day 5-6: Two Pointers & Prefix Sum

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 9 | 167 | Two Sum II - Input Array Is Sorted | Easy | Two Pointers | ⬜ | Contrast with hash map approach |
| 10 | 15 | 3Sum | Medium | Two Pointers + Sorting | ⬜ | Understand de-duplication |
| 11 | 11 | Container With Most Water | Medium | Two Pointers | ⬜ | Greedy + two pointers |
| 12 | 238 | Product of Array Except Self | Medium | Prefix Sum | ⬜ | No division allowed—prefix/suffix trick |

### Week 1-2 Learning Tips
- Master sliding window concept (appears in many variations)
- Understand when to use hash map vs two pointers
- Practice prefix sum optimization technique
- Focus on edge cases: empty arrays, single element, duplicates

---

# WEEK 3-4: Trees & DFS (Your Strongest Area)
**Focus:** Tree traversals, DFS patterns, backtracking  
**Problems:** 20  
**Time per problem:** 30-40 min

## Day 1-2: Tree Basics & Traversals

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 13 | 144 | Binary Tree Preorder Traversal | Easy | DFS + Stack | ⬜ | Master both recursive and iterative |
| 14 | 94 | Binary Tree Inorder Traversal | Easy | DFS + Stack | ⬜ | Iterative version is trickier |
| 15 | 145 | Binary Tree Postorder Traversal | Easy | DFS + Stack | ⬜ | Most complex iterative version |
| 16 | 102 | Binary Tree Level Order Traversal | Medium | BFS + Queue | ⬜ | Foundation for next problems |

## Day 3-4: Tree Path & Value Problems

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 17 | 124 | Binary Tree Maximum Path Sum | Hard | DFS + Recursion | ⬜ | **Most asked hard problem** |
| 18 | 112 | Path Sum | Easy | DFS | ⬜ | Simple recursion |
| 19 | 113 | Path Sum II | Medium | DFS + Backtracking | ⬜ | Return all paths |
| 20 | 236 | Lowest Common Ancestor of Binary Tree | Medium | DFS | ⬜ | Interview favorite |

## Day 5-6: Tree Construction & Validation

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 21 | 98 | Validate Binary Search Tree | Medium | DFS with bounds | ⬜ | Common pitfall: using node values only |
| 22 | 105 | Construct Binary Tree from Preorder and Inorder Traversal | Medium | DFS + HashMap | ⬜ | Interview pattern |
| 23 | 297 | Serialize and Deserialize Binary Tree | Hard | BFS/DFS + String | ⬜ | Design interview blend |
| 24 | 199 | Binary Tree Right Side View | Medium | BFS / DFS | ⬜ | Level-order variant |

## Day 7-10: Backtracking (Tree-based)

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 25 | 46 | Permutations | Medium | Backtracking | ⬜ | Foundation for all permutations |
| 26 | 77 | Combinations | Medium | Backtracking | ⬜ | N-choose-K pattern |
| 27 | 39 | Combination Sum | Medium | Backtracking | ⬜ | Candidates can be reused |
| 28 | 79 | Word Search | Medium | Backtracking on Grid | ⬜ | 2D grid exploration |
| 29 | 51 | N-Queens | Hard | Backtracking | ⬜ | Classic constraint satisfaction |
| 30 | 78 | Subsets | Medium | Backtracking | ⬜ | Power set generation |
| 31 | 131 | Palindrome Partitioning | Medium | Backtracking + DP | ⬜ | Find all valid partitions |
| 32 | 17 | Letter Combinations of a Phone Number | Medium | Backtracking | ⬜ | String combinations |

### Week 3-4 Learning Tips
- Master both recursive and iterative tree traversals
- Understand postorder traversal for bottom-up problems
- Always restore state after recursion in backtracking
- Use HashMap for O(1) lookups in construction problems

---

# WEEK 5-6: Graphs & Topological Sort
**Focus:** DFS/BFS on graphs, connected components, topological sort  
**Problems:** 15  
**Time per problem:** 30-40 min

## Day 1-2: Graph Basics (DFS/BFS)

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 33 | 200 | Number of Islands | Medium | DFS on Grid | ⬜ | Foundation for all grid problems |
| 34 | 133 | Clone Graph | Medium | DFS/BFS + HashMap | ⬜ | Deep copy pattern |
| 35 | 130 | Surrounded Regions | Medium | DFS/BFS on Grid | ⬜ | Mark and flip pattern |
| 36 | 695 | Max Area of Island | Medium | DFS on Grid | ⬜ | Track size during traversal |

## Day 3-4: Topological Sort (Most Important for Microservices Background)

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 37 | 207 | Course Schedule | Medium | Topological Sort + Cycle Detection | ⬜ | **Relates to service dependencies** |
| 38 | 210 | Course Schedule II | Medium | Topological Sort with Path | ⬜ | Return order vs just detection |
| 39 | 269 | Alien Dictionary | Hard | Topological Sort + Graph Building | ⬜ | Constraint satisfaction |
| 40 | 310 | Minimum Height Trees | Medium | Topological Sort Variant | ⬜ | BFS from leaves |

## Day 5-6: Connected Components & Union-Find

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 41 | 323 | Number of Connected Components | Medium | Union-Find / DFS | ⬜ | Both approaches important |
| 42 | 684 | Redundant Connection | Medium | Union-Find | ⬜ | Detect cycle with union-find |
| 43 | 959 | Regions Cut By Slashes | Medium | Union-Find on Grid | ⬜ | Advanced grid problems |
| 44 | 127 | Word Ladder | Hard | BFS + Graph Building | ⬜ | Shortest path in word graph |
| 45 | 261 | Graph Valid Tree | Medium | DFS + Cycle Detection | ⬜ | N nodes, N-1 edges condition |
| 46 | 797 | All Paths From Source to Target | Medium | DFS + Backtracking | ⬜ | Directed acyclic graph paths |
| 47 | 417 | Pacific Atlantic Water Flow | Medium | DFS from Edges | ⬜ | Reverse thinking pattern |

### Week 5-6 Learning Tips
- Build adjacency lists for graph representation
- Master Union-Find with path compression and union by rank
- Understand microservices connection: topological sort = service deployment order
- Know both DFS and BFS solutions

---

# WEEK 7: Dynamic Programming
**Focus:** 1D DP, 2D DP, memoization, state machines  
**Problems:** 15  
**Time per problem:** 40-50 min

## Day 1-2: 1D DP Foundation

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 48 | 70 | Climbing Stairs | Easy | 1D DP | ⬜ | Warm-up: dp[i] = dp[i-1] + dp[i-2] |
| 49 | 198 | House Robber | Medium | 1D DP | ⬜ | State: rob or skip |
| 50 | 213 | House Robber II | Medium | 1D DP + Constraint | ⬜ | Circular array variant |
| 51 | 322 | Coin Change | Medium | 1D DP Unbounded | ⬜ | Minimum coins problem |
| 52 | 518 | Coin Change II | Medium | 1D DP Unbounded | ⬜ | Count combinations |

## Day 3-4: 2D DP Matrix Problems

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 53 | 62 | Unique Paths | Medium | 2D DP Grid | ⬜ | Warm-up: count paths |
| 54 | 63 | Unique Paths II | Medium | 2D DP + Obstacles | ⬜ | Handle obstacles |
| 55 | 64 | Minimum Path Sum | Medium | 2D DP with Values | ⬜ | Optimize path cost |
| 56 | 174 | Dungeon Game | Hard | 2D DP Reverse | ⬜ | Think backwards |

## Day 5-6: String & Sequence DP

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 57 | 72 | Edit Distance | Medium | 2D DP String | ⬜ | Levenshtein: insert, delete, replace |
| 58 | 1143 | Longest Common Subsequence | Medium | 2D DP String | ⬜ | LCS classic |
| 59 | 300 | Longest Increasing Subsequence | Medium | 1D DP Sequence | ⬜ | Binary search optimization exists |
| 60 | 139 | Word Break | Medium | 1D DP + Hash Set | ⬜ | Segment validation |
| 61 | 647 | Palindromic Substrings | Medium | 2D DP or Expand | ⬜ | Count palindromes |

## Day 7: Stock Trading (State Machine DP)

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 62 | 123 | Best Time to Buy and Sell Stock III | Hard | State Machine DP | ⬜ | At most 2 transactions |
| 63 | 188 | Best Time to Buy and Sell Stock IV | Hard | State Machine DP | ⬜ | K transactions |

### Week 7 Learning Tips
- Define state clearly: dp[i] = what does it represent?
- Understand transition: how does dp[i] relate to previous states?
- Space optimization: many 2D DP can use O(1) or O(n) space
- Use memoization for top-down approach

---

# WEEK 8: Mock Interviews & Refinement
**Focus:** Timed practice, communication, edge cases  
**Problems:** 23 (10 additional + 13 company-specific)  
**Time per problem:** 45-60 min

## Day 1-2: Company-Specific Hard Problems

| # | LeetCode # | Problem | Difficulty | Company | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|---------|--------|-------|
| 64 | 146 | LRU Cache | Medium | Google/Amazon | Design + HashMap + LinkedList | ⬜ | Design + HashMap + LinkedList |
| 65 | 4 | Median of Two Sorted Arrays | Hard | Google | Binary Search | ⬜ | Binary search on arrays |
| 66 | 23 | Merge K Sorted Lists | Hard | Amazon | Priority Queue | ⬜ | Priority Queue or Divide & Conquer |
| 67 | 42 | Trapping Rain Water | Hard | Google/Facebook | Two Pointers/DP | ⬜ | Two pointers or DP |

## Day 3-4: Mixed Difficulty Warm-ups

| # | LeetCode # | Problem | Difficulty | Pattern | Status | Notes |
|---|-----------|---------|-----------|---------|--------|-------|
| 68 | 215 | Kth Largest Element in an Array | Medium | Min Heap/QuickSelect | ⬜ | Optimal is O(n) |
| 69 | 347 | Top K Frequent Elements | Medium | Bucket Sort/Heap | ⬜ | Practice both approaches |
| 70 | 621 | Task Scheduler | Medium | Greedy + Math | ⬜ | Interview gem |
| 71 | 253 | Meeting Rooms II | Medium | Sorting + Heap | ⬜ | Room allocation problem |
| 72 | 721 | Accounts Merge | Medium | Union-Find + Graph | ⬜ | Email consolidation |
| 73 | 208 | Implement Trie (Prefix Tree) | Medium | Trie | ⬜ | Foundation for word problems |

## Day 5-8: Mock Interview Sessions

### Mock Interview 1: Medium Array + Medium Tree
- **Problem Set:** Two Sum (Leetcode #1) + Binary Tree Level Order (Leetcode #102)
- **Duration:** 60 minutes (30 min per problem)
- **Status:** ⬜

### Mock Interview 2: Hard Problem + Easy Warm-up
- **Problem Set:** Merge K Sorted Lists (Leetcode #23) + Valid Parentheses (Leetcode #20)
- **Duration:** 60 minutes
- **Status:** ⬜

### Mock Interview 3: Medium DP + Medium Graph
- **Problem Set:** Coin Change (Leetcode #322) + Number of Islands (Leetcode #200)
- **Duration:** 60 minutes
- **Status:** ⬜

### Mock Interview 4: Hard Design + Medium String
- **Problem Set:** LRU Cache (Leetcode #146) + Longest Substring Without Repeating (Leetcode #3)
- **Duration:** 60 minutes
- **Status:** ⬜

### Mock Interview 5: Company-Specific Round
- **Research:** Target company's most-asked problems
- **Problem Set:** 1-2 company-specific problems
- **Duration:** 60 minutes
- **Status:** ⬜

### Week 8 Learning Tips
- Record yourself: mock with recording to review communication
- Always state complexity analysis clearly
- Test edge cases: empty, single element, large numbers, duplicates, negatives
- Mention trade-offs: time vs space

---

# 🎯 Additional Patterns & Problem Categories

## Pattern 8: Modified Binary Search
**Not covered in main 85, but recommended for 100% coverage**

| LeetCode # | Problem | Difficulty | Status |
|-----------|---------|-----------|--------|
| 33 | Search in Rotated Sorted Array | Medium | ⬜ |
| 34 | Find First and Last Position | Medium | ⬜ |
| 33 | Search in Rotated Sorted Array II | Hard | ⬜ |

## Pattern 13: Cyclic Sort
**Not covered in main 85, but useful**

| LeetCode # | Problem | Difficulty | Status |
|-----------|---------|-----------|--------|
| 268 | Missing Number | Easy | ⬜ |
| 287 | Find the Duplicate Number | Medium | ⬜ |
| 41 | First Missing Positive | Hard | ⬜ |

## Pattern 14: Bitwise Manipulation
**Not covered in main 85, but useful**

| LeetCode # | Problem | Difficulty | Status |
|-----------|---------|-----------|--------|
| 136 | Single Number | Easy | ⬜ |
| 137 | Single Number II | Medium | ⬜ |
| 260 | Single Number III | Medium | ⬜ |

---

# 📈 Progress Tracking

## Completion Status

### Week 1-2: Arrays, Strings, Hashing
- [ ] Two Sum
- [ ] Valid Anagram
- [ ] Contains Duplicate
- [ ] Best Time to Buy and Sell Stock
- [ ] Longest Substring Without Repeating Characters
- [ ] Sliding Window Maximum
- [ ] Minimum Window Substring
- [ ] Permutation in String
- [ ] Two Sum II - Input Array Is Sorted
- [ ] 3Sum
- [ ] Container With Most Water
- [ ] Product of Array Except Self

**Progress:** 0/12

### Week 3-4: Trees & DFS
- [ ] Binary Tree Preorder Traversal
- [ ] Binary Tree Inorder Traversal
- [ ] Binary Tree Postorder Traversal
- [ ] Binary Tree Level Order Traversal
- [ ] Binary Tree Maximum Path Sum
- [ ] Path Sum
- [ ] Path Sum II
- [ ] Lowest Common Ancestor of Binary Tree
- [ ] Validate Binary Search Tree
- [ ] Construct Binary Tree from Preorder and Inorder
- [ ] Serialize and Deserialize Binary Tree
- [ ] Binary Tree Right Side View
- [ ] Permutations
- [ ] Combinations
- [ ] Combination Sum
- [ ] Word Search
- [ ] N-Queens
- [ ] Subsets
- [ ] Palindrome Partitioning
- [ ] Letter Combinations of a Phone Number

**Progress:** 0/20

### Week 5-6: Graphs & Topological Sort
- [ ] Number of Islands
- [ ] Clone Graph
- [ ] Surrounded Regions
- [ ] Max Area of Island
- [ ] Course Schedule
- [ ] Course Schedule II
- [ ] Alien Dictionary
- [ ] Minimum Height Trees
- [ ] Number of Connected Components
- [ ] Redundant Connection
- [ ] Regions Cut By Slashes
- [ ] Word Ladder
- [ ] Graph Valid Tree
- [ ] All Paths From Source to Target
- [ ] Pacific Atlantic Water Flow

**Progress:** 0/15

### Week 7: Dynamic Programming
- [ ] Climbing Stairs
- [ ] House Robber
- [ ] House Robber II
- [ ] Coin Change
- [ ] Coin Change II
- [ ] Unique Paths
- [ ] Unique Paths II
- [ ] Minimum Path Sum
- [ ] Dungeon Game
- [ ] Edit Distance
- [ ] Longest Common Subsequence
- [ ] Longest Increasing Subsequence
- [ ] Word Break
- [ ] Palindromic Substrings
- [ ] Best Time to Buy and Sell Stock III
- [ ] Best Time to Buy and Sell Stock IV

**Progress:** 0/15

### Week 8: Mock Interviews & Hard Problems
- [ ] LRU Cache
- [ ] Median of Two Sorted Arrays
- [ ] Merge K Sorted Lists
- [ ] Trapping Rain Water
- [ ] Kth Largest Element in an Array
- [ ] Top K Frequent Elements
- [ ] Task Scheduler
- [ ] Meeting Rooms II
- [ ] Accounts Merge
- [ ] Implement Trie
- [ ] Mock Interview 1
- [ ] Mock Interview 2
- [ ] Mock Interview 3
- [ ] Mock Interview 4
- [ ] Mock Interview 5
- [ ] Additional Company Problems (8 problems)

**Progress:** 0/23

---

## Overall Progress Summary

```
Week 1-2:  [                    ] 0/12   (0%)
Week 3-4:  [                    ] 0/20   (0%)
Week 5-6:  [                    ] 0/15   (0%)
Week 7:    [                    ] 0/15   (0%)
Week 8:    [                    ] 0/23   (0%)

TOTAL:     [                    ] 0/85   (0%)
```

---

# 🔗 Useful Resources

| Resource | Type | Link | Cost |
|----------|------|------|------|
| NeetCode | Video Explanations | https://neetcode.io | Free |
| LeetCode | Problem Platform | https://leetcode.com | Freemium |
| AlgoExpert | Curated + Video | https://www.algoexpert.io | Paid |
| InterviewBit | Guided Path | https://www.interviewbit.com | Free |

---

# 📝 Notes & Learnings

## Key Insights
- Sliding window pattern = 30% of array problems
- Topological sort = service dependency resolution (your microservices experience!)
- Graph problems = API call chains
- DP = breaking problems into overlapping subproblems

## Common Mistakes to Avoid
- ❌ Over-complicating simple hash map solutions
- ❌ Forgetting to test edge cases (empty, single element, duplicates)
- ❌ Not considering space optimization in DP
- ❌ Using wrong traversal order for trees
- ❌ Forgetting to restore state in backtracking

## Interview Tips
- ✅ Explain approach before coding
- ✅ State complexity analysis clearly
- ✅ Ask clarifying questions first
- ✅ Mention trade-offs and alternatives
- ✅ Use Java 17 features where appropriate (records, sealed classes)

---

# 📅 Study Schedule Recommendation

**Daily Time Allocation:**
- 11:00 - 12:30 PM: DSA & LeetCode (1.5 hours)
    - 15 min: Review problem statement & approach
    - 30 min: Code solution
    - 30 min: Test & optimize
    - 15 min: Compare with solutions

**Weekly Pace:**
- Weeks 1-2: 2-3 problems/day (faster, foundations)
- Weeks 3-4: 1-2 problems/day (trees are dense)
- Weeks 5-6: 1.5 problems/day (graphs need careful thinking)
- Week 7: 2 problems/day (DP patterns build confidence)
- Week 8: 1 mock interview + 1 problem/day

---

# 🎯 Success Criteria

✅ **This plan is successful when you:**
1. Can solve each problem in 20-30 minutes without hints
2. Understand the pattern, not just memorize solutions
3. Can explain trade-offs and complexity analysis
4. Score 80%+ on LeetCode (beat that many submissions)
5. Feel confident in technical interviews

---

# Last Updated
**Date:** September 24, 2026  
**By:** Vinod  
**Source:** 8-Week Personalized LeetCode Interview Plan for Java Developers with Microservices Background

---

# How to Use This File

1. **Update Status:** Change ⬜ to ✅ when problem is solved
2. **Track Progress:** Run `grep "✅" LEETCODE_PLAN.md | wc -l` to count completed problems
3. **Review:** Read the week's overview before starting
4. **Reference:** Look up patterns and approaches while solving
5. **Commit:** Update and commit after every few problems solved

---

# Repository Structure

```
LeetCode/
├── LEETCODE_PLAN.md (this file)
├── week-1-2/
│   ├── TwoSum.java
│   ├── ValidAnagram.java
│   ├── ContainsDuplicate.java
│   └── ...
├── week-3-4/
│   ├── BinaryTreeTraversal.java
│   ├── Permutations.java
│   └── ...
├── week-5-6/
│   ├── NumberOfIslands.java
│   ├── CourseSchedule.java
│   └── ...
├── week-7/
│   ├── CoinChange.java
│   ├── LongestIncreasingSubsequence.java
│   └── ...
└── week-8/
    ├── LRUCache.java
    └── ...
```

---

**Good luck! You've got this! 🚀**