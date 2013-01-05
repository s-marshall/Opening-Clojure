# project123

## AN OPENING TO CLOJURE

INSTALLING CLOJURE
------------------

Install Clojure on your computer.

[Clojure download page][cl]
 
[cl]: http://clojure.org/downloads

In this example, the jar of clojure (in this case, clojure-1.4.0.jar) is in a directory called Clojure.

INSTALLING LEININGEN
--------------------

Install Leiningen, a package manager, on your computer.

[Leiningen home page][ln]

[ln]: http://leiningen.org

CREATING A PROJECT
------------------

Go to the Clojure directory and make a new project called project123.

	$ lein new project123

Leiningen creates a directory named project123 containing default directories and files for your project.

ADDING LIBRARIES
----------------

There are libraries called [Clojure Contrib Libraries][clib] for adding to your project.

[clib]:http://dev.clojure.org/display/doc/Clojure+Contrib+Libraries

	project123 will use the math library - math.numeric-tower

To add a library, you add a dependency to the project.
The dependencies are listed in the file called project.clj in the Clojure/project123 directory.

ADDING DEPENDENCIES
-------------------

Edit the default project.clj file and add the dependency [org.clojure/math.numeric-tower "0.0.2"].

	(defproject project123 "0.1.0-SNAPSHOT"
  		:description "FIXME: write description"
  		:url "http://example.com/FIXME"
  		:license {:name "Eclipse Public License"
         	   	:url "http://www.eclipse.org/legal/epl-v10.html"}
  		:dependencies [[org.clojure/clojure "1.4.0"]
  			[org.clojure/math.numeric-tower "0.0.2"])

The namespace created by Leiningen is called project123.core. The namespace is the world in which the project lives.
To make life easier, add the namespace to project.clj.

					:
					:
	:dependencies [[org.clojure/clojure "1.4.0"]
			[org.clojure/math.numeric-tower "0.0.2"]
  	:main project123.core)
  

EDITING THE PROGRAM
-------------------

Leiningen also creates the file called core.clj in the directory project123/src/project123.  

Use your favorite text editor to open and edit core.clj.


These are the contents of core.clj produced by Leiningen.

	(ns project123.core)
	
	(defn foo
  	"I don't do a whole lot."
  	[x]
  	(println x "Hello, World!"))

ADDING A LIBRARY TO THE PROGRAM
---------------------------------

Since I want to use the math library, core.clj after editing is:

	(ns project123.core (:require [clojure.math.numeric-tower :as math]))

	(defn foo
  	"I don't do a whole lot."
  	[x]
  	(println x "Hello, World! and the square root of five" (math/sqrt 5)))
  
	(defn -main [name]
		(foo name))
  
Save the edited program. The program can now be run.

RUNNING THE PROGRAM
-------------------

Change to the project123 directory.

To get the dependencies for the project, run:

	$ lein deps

To start clojure and open in the namespace of the program, run:

	$ lein repl

You are now in the project123.core namespace in Clojure.
The command line should look like:

	project123.core=>

The functions in your program and other Clojure functions can be run and tested.
To run the foo function:

	project123.core=> (foo "Joe")

should return

	Joe Hello, World! and the square root of five 2.23606797749979
	nil

Now, run the main function

	project123.core=> (-main "Schmoe")

should return

	Schmoe Hello, World! and the square root of five 2.23606797749979
	nil

CELEBRATING
-----------

Yay! It worked.

HOT RELOADING
-------------

You can edit the core.clj file. After saving the edited file, reload the file by running:

	project123.core=> (require 'project123.core :reload-all)
		
STOP EXIT QUIT
---------------

The three ways to exit Clojure are:

	project123.core=> (quit)

or

	project123.core=> (exit)

or

	Control-D
				
RUNNING FROM THE COMMAND LINE
-----------------------------

To run the project program from the command line (from the project123 directory) without starting Clojure.

	$ lein run "Ava"

If the line :main project123 wasn't added to project.clj, you have to run:

	$ lein run -m project123.core "Ava"

## License

Copyright © 2013 Shelley Marshall

Distributed under the Eclipse Public License, the same as Clojure.

