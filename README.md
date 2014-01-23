EXPRESSION EVALUATOR
====================
this library has a feature that it can evaluate expression
  command:- sh exp_eval.sh [expression]
  example:- sh exp_eval.sh 3+4
  will give 7
INSTALLATION
============
1.copy expression-evaluator-0.1.zip folder in your system
2.extract all files from zip.
3.add a path variable 'EVALUATOR_HOME' in your systems environment variable containing
    path from Current Drive to this folders name.
4.add $EXP_HOME/bin variable in users path variable.
5.use exp_eval.sh command to use expression evaluator.

Release 0.3:-
It can evaluate an expression with positive float numbers and following operators
        +,-,*,/,^
   eg.
        4.34+2.32*3.2 will result 21.31

    use  exp_eval.sh [expression] to use evaluator.

Release 0.2:-
It can evaluate an expression with positive numbers and following operators
	+,-,*,/,^
eg.
	4+2*3 will result 18.0
    	4-2/2 will result 0.0
	4*2 will result 8.0
	4/2+2 will result 4.0
	4^2 will result 16.0
	use  exp_eval.sh [expression] to use evaluator.

Release 0.1:-
 it can evaluate expression of two positive integers with following operators
	+,-,*,/,^
eg.
    	4+2 will result 6
    	4-2 will result 2
	    4*2 will result 8
	    4/2 will result 2
	    4^2 will result 16
	use  exp_eval.sh [expression] to use evaluator.
