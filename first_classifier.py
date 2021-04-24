# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from sklearn import tree

#smooth as 1
#bumpy as 0

features = [[140,1],[130,1],[150,0],[170,0]]

#apple as 0
#orange as 1
labels = [0,0,1,1]

#decision
clf = tree.DecisionTreeClassifier()

#train
clf = clf.fit(features,labels)

#
print(clf.predict([[150,0]]))
