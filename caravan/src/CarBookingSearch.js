// import React, { useState} from 'react';
// import axios from 'axios';

// function CarBookingSearch() {
//   const [city, setCity] = useState('');
//   const [bookings, setBookings] = useState([]);

//   const handleSearch = () => {
//     axios.get(`http://localhost:8080/bookings/${city}`)
//       .then(response => {
//         setBookings(response.data);
//       })
//       .catch(error => {
//         console.error(error);
//         setBookings([]);
//       });
//   };

//   return (
//     <div>
//       <div>
//         <input
//           type="text"
//           placeholder="Enter City Name"
//           value={city}
//           onChange={(e) => setCity(e.target.value)}
//         />
//         <button onClick={handleSearch}>Search</button>
//       </div>
//       <div>
//         <h2>Caravan Bookings in {city}</h2>
//         <ul>
//           {bookings.map(booking => (
//             <li key={booking.id}>{booking.caravanType
//             }</li>
//           ))}
//         </ul>
//       </div>
//     </div>
//   );
// }

// export default CarBookingSearch;
