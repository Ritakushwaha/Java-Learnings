# -*- coding: utf-8 -*-
"""
Created on Sat Apr 24 21:27:30 2021

@author: 0
"""

from sklearn import tree

features = [[2,100],[6,25],[1,300],[1,1000],[4,100],[10,100]]

Label = [1,2,1,1,2,2]


#decision
clf = tree.DecisionTreeClassifier()

#train
clf = clf.fit(features,Label)

#
print(clf.predict([[4,100]]))
