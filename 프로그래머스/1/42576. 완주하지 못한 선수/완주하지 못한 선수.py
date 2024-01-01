from collections import Counter
def solution(participant, completion):
    part = Counter(participant)
    comp = Counter(completion)
    
    part.subtract(comp)
    
    return ''.join(list(part.elements()))