 p a c k a g e   a l g o r i t h m ;  
 i m p o r t   j a v a . i o . * ;  
 i m p o r t   j a v a . u t i l . S t r i n g T o k e n i z e r ;  
  
  
 p u b l i c   c l a s s   M a i n 1 5 5 5 2   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   I O E x c e p t i o n   {  
 	 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( S y s t e m . i n ) ) ;  
 	 	 B u f f e r e d W r i t e r   b w   =   n e w   B u f f e r e d W r i t e r ( n e w   O u t p u t S t r e a m W r i t e r ( S y s t e m . o u t ) ) ;  
 	 	  
 	 	 i n t   t   =   I n t e g e r . p a r s e I n t ( b r . r e a d L i n e ( ) ) ;  
 	 	  
 	 	 w h i l e ( t > 0 )   {  
 	 	 	 S t r i n g   s   =   b r . r e a d L i n e ( ) ;  
 	 	 	 S t r i n g T o k e n i z e r   s t   =   n e w   S t r i n g T o k e n i z e r ( s ) ;  
 	 	 	 i n t   a   =   I n t e g e r . p a r s e I n t ( s t . n e x t T o k e n ( ) ) ;  
 	 	 	 i n t   b   =   I n t e g e r . p a r s e I n t ( s t . n e x t T o k e n ( ) ) ;  
 	 	 	 b w . w r i t e ( I n t e g e r . t o S t r i n g ( a + b ) ) ;  
 	 	 	 b w . n e w L i n e ( ) ;  
 	 	 	 t - - ;  
 	 	 }  
 	 	 b w . f l u s h ( ) ;  
 	 	 b w . c l o s e ( ) ;  
 	 }  
 }  
