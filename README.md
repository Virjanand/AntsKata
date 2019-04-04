# AntsKata
Two groups of ants for example ABC and DEFG walk over each other. What is the order after n steps?
With the given example:
1 step: ABDCEFG
2 steps: ADBECFG
3 steps: DAEBFCG
4 steps: DEAFBGC
5 steps: DEFAGBC
6 steps: DEFGABC
end

## ToDo
- [x] "A", "B", 1 step -> "BA"
- [x] "AB", "C", 1 step -> "ACB"
- [x] "AB", "C", 2 steps -> "CAB"
- [x] "AB", "CD", 1 step -> "ACBD" (no changes needed)
- [x] "AB", "CD", 2 steps -> "CADB"
- [ ] "AB", "CD", 3 steps -> "CDAB"