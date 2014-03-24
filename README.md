RPAL Interpreter
=======
This is an interpreter written for the RPAL functional language.

**There are three ways to view a textual representation of the abstract syntax tree generated:**
 
* Use the p1 script provided: <code>p1 -ast &lt;rpal\_program\_filename&gt;</code>. This script can be invoked from ANY directory e.g. <code>other\_directory$ path\_to\_RPAL-Interpreter/p1 -ast &lt;filename&gt;</code>

* Use the makefile from this directory: <code>make run cmd='-ast &lt;rpal\_program\_filename&gt;'</code>. From another directory, <code>other\_directory$ make run cmd='-ast &lt;filename&gt;' -C path\_to\_RPAL-Interpreter</code>.

* Invoke the parser yourself from this directory (after compiling the code, of course): <code>java -cp . P1 -ast &lt;filename&gt;</code> or from another directory <code>java -cp path\_to\_RPAL-Interpreter P1 -ast &lt;filename&gt;</code>


To run a diff on the AST generated by this code and Steve Walstra's C implementation for various RPAL programs, run (in this directory): <code>make test</code>. From another directory, <code>make test -C path\_to\_RPAL-Interpreter</code>. Note that this requires you to have the RPAL programs that you wish to run in the directory <code>~/rpal/tests/</code>

### Completed:

* Scanner (lexer + screener)

* Parser

### Under development:

* AST standardization

* Interpreter using CSE Machine
