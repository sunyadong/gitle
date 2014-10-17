package books;

	public class Book {
		private String ISBN;
		private String Title;
		private int AuthorID;
		private String Publisher;
		private String PublishDate;
		private int Price;
		//git ceshi jasklddfsdhkfaghdf
		public void setISBN(String ISBN)
		{
			this.ISBN = ISBN;
		}
		public String getISBN()
		{
			return ISBN;
		}

		public void setTitle(String Title)
		{
			this.Title = Title;
		}
		public String getTitle()
		{
			return Title;
		}

		public void setAuthorID(int AuthorID)
		{
			this.AuthorID = AuthorID;
		}
		public int getAuthorID()
		{
			return AuthorID;
		}


		public void setPublisher(String Publisher)
		{
			this.Publisher = Publisher;
		}
		public String getPublisher()
		{
			return Publisher;
		}

		public void setPublishDate(String PublishDate)
		{
			this.PublishDate = PublishDate;
		}
		public String getPublishDate()
		{
			return PublishDate;
		}

		public void setPrice(int Price)
		{
			this.Price = Price;
		}
		public int getPrice()
		{
			return Price;
		}

		public  Book(String ISBN,String Title,int AuthorID,String Publisher,String PublishDate,int Price)
		{
			this.ISBN = ISBN;
			this.Title = Title;
			this.AuthorID = AuthorID;
			this.Publisher = Publisher;
			this.PublishDate = PublishDate;
			this.Price = Price;
		}

	}



