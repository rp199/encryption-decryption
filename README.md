# encryption-decryption
Encryption Decryption (Java)
Project from https://hyperskill.org.

This is a little encryption/decryption program. 

## Parameters:
* `data` (optional) _[string]_ - message to be processed by the program. When `data` and `in` aren't defined, promps the user to enter `data` and `key` parameters.
* `key` _[integer]_ - gives the key to be used by the encryption algorithm. Required when `in` parameter it's defined.
* `alg` (optional) _[string]_ - defines the algorithm used by the program. When not defined, prompts user. Possible values:
  * `shift` -  shifts each letter by the specified number (`key`) according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (a follows z). Only lowercase 
  * `unicode` - shifts every character from the given string `data` number of `key` positions on unicode table.
* `mode` (optional) _[string]_ - defines program mode. When not defined, prompts user. Possible values:
  * `enc` - encrypts `data`
  * `dec` - decrypts `data`
* `in` (optional) _[string]_ - path to a file containing text to be procced by the program
* `out` (optional) _[string]_ - path to a file to print the result of the program. If not defined the result its printed to the console.

## Example
  ```
  java Main -key 10 -mode enc -in road_to_treasure.txt -alg unicode -out protected.txt
  ```
